package org.jetbrains.intellij

class IntelliJPluginExtension {
    String[] plugins
    String version
    String pluginName
    String sandboxDirectory
    String intellijRepo
    boolean instrumentCode
    boolean updateSinceUntilBuild
    boolean downloadSources
    Publish publish

    File ideaDirectory
    File ideaSourcesFile
    private final Set<File> intellijFiles = new HashSet<>();
    private final Set<File> runClasspath = new HashSet<>();

    Set<File> getIntellijFiles() {
        return intellijFiles
    }

    Set<File> getRunClasspath() {
        return runClasspath
    }

    @SuppressWarnings("GroovyUnusedDeclaration")
    def publish(Closure c) {
        publish.with(c)
    }

    public static class Publish {
        String pluginId
        String username
        String password
        String channel

        @SuppressWarnings("GroovyUnusedDeclaration")
        def pluginId(String pluginId) {
            this.pluginId = pluginId
        }

        @SuppressWarnings("GroovyUnusedDeclaration")
        def username(String username) {
            this.username = username
        }

        @SuppressWarnings("GroovyUnusedDeclaration")
        def password(String password) {
            this.password = password
        }

        @SuppressWarnings("GroovyUnusedDeclaration")
        def channel(String channel) {
            this.channel = channel
        }
    }

}
