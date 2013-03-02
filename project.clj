(defproject nbt-clj-reader "0.1.0-SNAPSHOT"
  :description "A simple library to read Minecraft NBT data structures"
  :url "http://github.com/NathanWilliams/nbt-clj-reader"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;:jvm-opts ["-Xdebug" "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9900"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [gloss "0.2.2-beta5"] ;DSL for reading binary data
                 [org.clojure/tools.trace "0.7.5"]
                 [org.clojure/tools.namespace "0.2.2"]]) ;Used to refresh the repl during development
