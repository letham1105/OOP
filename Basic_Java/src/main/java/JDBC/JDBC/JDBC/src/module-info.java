module MyModule {
    requires java.sql; // Module JDK chứa các API liên quan đến JDBC
    requires java.desktop; // Module JDK chứa các API liên quan đến Java Desktop Application, bao gồm javax.swing
}
