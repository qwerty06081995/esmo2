package com.company.noesmo.view.adminuser;

import com.company.noesmo.entity.AdminUser;
import com.company.noesmo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "admin-users", layout = MainView.class)
@ViewController(id = "noesmo_AdminUser.list")
@ViewDescriptor(path = "admin-user-list-view.xml")
@LookupComponent("adminUsersDataGrid")
@DialogMode(width = "64em")
public class AdminUserListView extends StandardListView<AdminUser> {
}