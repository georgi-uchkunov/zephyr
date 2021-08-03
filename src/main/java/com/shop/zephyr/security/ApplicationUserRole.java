package com.shop.zephyr.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.shop.zephyr.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

	BASICUSER(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(USER_READ, USER_WRITE, USER_UPDATE, USER_DELETE, PRODUCT_READ, PRODUCT_WRITE, PRODUCT_UPDATE,
			PRODUCT_DELETE, PURCHASE_READ, PURCHASE_WRITE, PURCHASE_UPDATE, PURCHASE_DELETE));

	private final Set<ApplicationUserPermission> permissions;

	ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
		this.permissions = permissions;
	}

	public Set<ApplicationUserPermission> getPermissions() {
		return permissions;
	}

	public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
		Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
				.map(permission -> new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toSet());
		permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
		return permissions;
	}
}
