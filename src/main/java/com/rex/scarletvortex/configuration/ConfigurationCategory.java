package com.rex.scarletvortex.configuration;

public enum ConfigurationCategory
{
    ALL("All", "All configuration values are in this category (for now)");

    public final String name;
    public final String comment;

    ConfigurationCategory(String name, String comment)
    {
        this.name = name;
        this.comment = comment;
    }
}
