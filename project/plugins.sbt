// Build Server Plugins
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.5.10")

// Linting Plugins
addSbtPlugin("org.scalameta"    % "sbt-scalafmt"              % "2.5.0")
addSbtPlugin("ch.epfl.scala"    % "sbt-scalafix"              % "0.11.0")
addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.3.1")

// Versioning and Release Plugins
addSbtPlugin("com.eed3si9n"   % "sbt-buildinfo"  % "0.11.0")
addSbtPlugin("com.jsuereth"   % "sbt-pgp"        % "2.1.1")
addSbtPlugin("com.dwijnand"   % "sbt-dynver"     % "4.1.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype"   % "3.9.21")
addSbtPlugin("com.geirsson"   % "sbt-ci-release" % "1.5.7")

// Docs Plugins
addSbtPlugin("org.scalameta"     % "sbt-mdoc"   % "2.3.7")
addSbtPlugin("com.github.sbt"    % "sbt-unidoc" % "0.5.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")

// Cross-Compiler Plugins
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.13.2")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.14")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")
addSbtPlugin("org.portable-scala" % "sbt-platform-deps"             % "1.0.2")

// Benchmarking Plugins
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.5")

libraryDependencies += "org.snakeyaml" % "snakeyaml-engine" % "2.7"
libraryDependencies += "dev.zio"      %% "zio"              % "2.0.16"
libraryDependencies += "io.circe"     %% "circe-yaml"       % "0.14.2"
