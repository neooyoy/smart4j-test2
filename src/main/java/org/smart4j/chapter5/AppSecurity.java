package org.smart4j.chapter5;

import org.smart4j.plugin.SmartSecurity;

import java.util.Set;

/**
 * 应用安全控制
 *
 * @author cj
 * @since 1.0.0
 */
public class AppSecurity implements SmartSecurity {
    @Override
    public String getPassword(String username) {
        String sql = "select passwork from user where username = ?";
//        return DatabaseHelper.query(sql, username);
        return null;
    }

    @Override
    public Set<String> getRoleNameSet(String username) {
        return null;
    }

    @Override
    public Set<String> getPermissionNameSet(String roleName) {
        return null;
    }
}
