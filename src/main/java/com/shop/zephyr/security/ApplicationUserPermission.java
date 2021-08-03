package com.shop.zephyr.security;

public enum ApplicationUserPermission {
	
	 	USER_READ("user:read"),
	    USER_WRITE("user:write"),
	    USER_UPDATE("user:update"),
	    USER_DELETE("user:delete"),
	    PRODUCT_READ("product:read"),
	    PRODUCT_WRITE("product:write"),
	    PRODUCT_UPDATE("product:update"),
	    PRODUCT_DELETE("product:delete"),
	    PURCHASE_READ("purchase:read"),
	    PURCHASE_WRITE("purchase:write"),
	    PURCHASE_UPDATE("purchase:update"),
	    PURCHASE_DELETE("purchase:delete");

	    private final String permission;

	    ApplicationUserPermission(String permission) {
	        this.permission = permission;
	    }

	    public String getPermission() {
	        return permission;
	    }
}
