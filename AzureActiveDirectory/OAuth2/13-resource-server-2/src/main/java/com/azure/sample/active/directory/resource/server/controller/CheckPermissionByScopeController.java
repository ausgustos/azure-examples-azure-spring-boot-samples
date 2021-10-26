package com.azure.sample.active.directory.resource.server.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckPermissionByScopeController {

    @GetMapping("/scope/resource-server-2-scope-1")
    @PreAuthorize("hasAuthority('SCOPE_resource-server-2.scope-1')")
    public String resourceServer1Scope1() {
        return "Hi, this is resource-server-2. You can access my endpoint: /scope/resource-server-2-scope-1";
    }

    @GetMapping("/scope/resource-server-2-scope-2")
    @PreAuthorize("hasAuthority('SCOPE_resource-server-2.scope-2')")
    public String resourceServer1Scope2() {
        return "Hi, this is resource-server-2. You can access my endpoint: /scope/resource-server-2-scope-2";
    }
}
