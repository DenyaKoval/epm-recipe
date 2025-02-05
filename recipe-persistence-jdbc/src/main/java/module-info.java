module recipe.persistence.jdbc {
    requires recipe.domain;
    requires recipe.persistence;
    requires java.sql;
    requires spring.context;
    requires spring.beans;
    requires spring.jdbc;
    requires commons.dbcp2;
    requires java.management;

    opens com.epm.recipe.persistence.jdbc to spring.core;
    opens com.epm.recipe.persistence.jdbc.config to spring.core;

    exports com.epm.recipe.persistence.jdbc.config;
    exports com.epm.recipe.persistence.jdbc;
}