-- 该脚本不要直接执行， 注意维护菜单的父节点ID 默认 父节点-1 

-- 菜单SQL
insert into sys_menu ( menu_id,parent_id, path, permission, menu_type, icon, del_flag, create_time, sort_order, update_time, name)
values (1704722917060, '-1', '/pswdmanager/accountInfo/index', '', '0', 'icon-bangzhushouji', '0', null , '8', null , '账号表管理');

-- 菜单对应按钮SQL
insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1704722917061,1704722917060, 'pswdmanager_accountInfo_view', '1', null, '1',  '0', null, '0', null, '账号表查看');

insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1704722917062,1704722917060, 'pswdmanager_accountInfo_add', '1', null, '1',  '0', null, '1', null, '账号表新增');

insert into sys_menu (menu_id, parent_id, permission, menu_type, path, icon,  del_flag, create_time, sort_order, update_time, name)
values (1704722917063,1704722917060, 'pswdmanager_accountInfo_edit', '1', null, '1',  '0', null, '2', null, '账号表修改');

insert into sys_menu (menu_id, parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1704722917064,1704722917060, 'pswdmanager_accountInfo_del', '1', null, '1',  '0', null, '3', null, '账号表删除');

insert into sys_menu ( menu_id,parent_id, permission, menu_type, path, icon, del_flag, create_time, sort_order, update_time, name)
values (1704722917065,1704722917060, 'pswdmanager_accountInfo_export', '1', null, '1',  '0', null, '3', null, '导入导出');