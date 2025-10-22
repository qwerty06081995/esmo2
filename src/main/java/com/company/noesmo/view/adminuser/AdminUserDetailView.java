package com.company.noesmo.view.adminuser;

import com.company.noesmo.entity.AdminUser;
import com.company.noesmo.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "admin-users/:id", layout = MainView.class)
@ViewController(id = "noesmo_AdminUser.detail")
@ViewDescriptor(path = "admin-user-detail-view.xml")
@EditedEntityContainer("adminUserDc")
public class AdminUserDetailView extends StandardDetailView<AdminUser> {
}