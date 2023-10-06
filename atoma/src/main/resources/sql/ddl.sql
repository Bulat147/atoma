drop table if exists account;
create table account (
    id uuid primary key not null,
    username varchar(50) unique not null,
    active bool default true,
    role varchar(32) not null,
    email varchar(50) unique,
    hash_password varchar(100) not null ,
    photo_path varchar(80),
    signup_date timestamptz not null,
    DELETED bool default false,

    constraint account_role_ch check ( role in ('USER', 'ADMIN') )
);


drop table if exists board;
create table board (
    id uuid primary key not null,
    title varchar(50) not null,
    owner_id uuid,
    description text,
    access_mode varchar(30) not null,
    created_date timestamptz not null,
    ARCHIVED bool default false,
    DELETED bool default false,

    constraint board_account_fk foreign key (owner_id) references account(id) on delete SET NULL,
    constraint board_access_mode_ch check ( access_mode in ('PUBLIC', 'PRIVATE', 'PERSONAL') )
);


drop table if exists list;
create table list(
    id uuid primary key not null,
    title varchar(32) not null,
    board_id uuid not null,
    ord_in_board int not null,
    default_list bool default false,
    ARCHIVED bool default false,
    DELETED bool default false,

    constraint list_board_fk foreign key (board_id) references board(id) on delete CASCADE
);


drop table if exists board_membership;
create table board_membership(
    id uuid primary key not null,
    board_id uuid not null references board(id) ON DELETE CASCADE,
    account_id uuid not null references account(id) ON DELETE CASCADE,
    mode varchar(32) not null,
    DELETED bool default false,

    constraint membership_mode_ch check ( mode in ('READ', 'READ_WRITE') )
);


drop table if exists account_favorite_boards;
create table account_favorite_boards (
    id uuid primary key not null,
    board_id uuid not null references board(id) ON DELETE CASCADE,
    account_id uuid not null references account(id) ON DELETE CASCADE,
    DELETED bool default false
);


drop table if exists permit_request;
create table permit_request(
    id uuid primary key not null,
    board_id uuid not null references board(id) ON DELETE CASCADE,
    account_id uuid not null references account(id) ON DELETE CASCADE,
    mode varchar(32) not null,
    answer bool,
    created_date timestamptz not null,
    DELETED bool default false,

    constraint membership_mode_ch check ( mode in ('READ', 'READ_WRITE') )
);


drop table if exists task;
create table task(
    id uuid primary key not null,
    name varchar(50) not null,
    description text,
    priority int default 4,
    start_date timestamptz,
    finish_date timestamptz,
    achieved bool default false,
    created_date timestamptz not null,
    ARCHIVED bool default false,
    DELETED bool default false,

    constraint task_priority_ch check ( priority in (1, 2, 3, 4) )
);


drop table if exists checklist;
create table checklist(
    id uuid primary key not null,
    title varchar(32) not null,
    parent_task_id uuid not null references task(id) ON DELETE CASCADE,
    ord_in_parent_task int not null,
    ARCHIVED bool default false,
    DELETED bool default false
);


drop table if exists task_lists;
create table task_lists(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    list_id uuid not null references list(id) ON DELETE CASCADE,
    ord_in_list int not null,
    ARCHIVED bool default false,
    DELETED bool default false
);


create table task_executors(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    executor_id uuid not null references account(id) ON DELETE CASCADE,
    ARCHIVED bool default false,
    DELETED bool default false
);


create table comment(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    author_id uuid not null references account(id) ON DELETE CASCADE,
    comment text,
    created_date timestamptz not null,
    ARCHIVED bool default false,
    DELETED bool default false
);


drop table if exists task_checklists;
create table task_checklists(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    checklist_id uuid not null references checklist(id) ON DELETE CASCADE,
    ord_in_checklist int not null,
    ARCHIVED bool default false,
    DELETED bool default false
);


drop table if exists personal_tag;
create table personal_tag(
    id uuid primary key not null,
    account_id uuid not null references account(id) ON DELETE CASCADE,
    name varchar(50) not null,
    color varchar(32) not null default 'GREY',
    ARCHIVED bool default false,
    DELETED bool default false,

    constraint tag_color_ch check ( color in ('RED', 'ORANGE', 'YELLOW',
                                                'LIME', 'GREEN', 'SKY_BLOW',
                                                'BLOW', 'PINK', 'VIOLET',
                                                'GREY', 'BLACK') )
);


drop table if exists task_personal_tags;
create table task_personal_tags(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    personal_tag_id uuid not null references personal_tag(id) ON DELETE CASCADE,
    ARCHIVED bool default false,
    DELETED bool default false
);


drop table if exists general_tag;
create table general_tag(
    id uuid primary key not null,
    board_id uuid not null references board(id) ON DELETE CASCADE,
    name varchar(50) not null,
    color varchar(32) not null default 'GREY',
    ARCHIVED bool default false,
    DELETED bool default false,

    constraint tag_color_ch check ( color in ('RED', 'ORANGE', 'YELLOW',
                                           'LIME', 'GREEN', 'SKY_BLOW',
                                           'BLOW', 'PINK', 'VIOLET',
                                           'GREY', 'BLACK') )
);


drop table if exists task_general_tags;
create table task_general_tags(
    id uuid primary key not null,
    task_id uuid not null references task(id) ON DELETE CASCADE,
    general_tag_id uuid not null references general_tag(id) ON DELETE CASCADE,
    ARCHIVED bool default false,
    DELETED bool default false
);


