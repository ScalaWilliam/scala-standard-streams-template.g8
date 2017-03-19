***Batteries included!***

> Minimal template to produce Scala applications that work with standard output.<br>
Comes with an automatic configuration for Travis & publishing to Docker Hub.

<!-- toc -->

- [Usage](#usage)
  * [`kafka-mirror` on Docker Hub](#kafka-mirror-on-docker-hub)
- [Technical choices & relevant documentation](#technical-choices--relevant-documentation)
- [Other notes](#other-notes)
- [Licence](#licence)

<!-- tocstop -->

# Usage

```
$ sbt new ScalaWilliam/scala-standard-streams-template.g8
```

And then look at `README.md`.

# Relevant documentation

* [SBT](http://www.scala-sbt.org/) compiles our source code. Read [Essential SBT](https://www.scalawilliam.com/essential-sbt/) to get more familiar with SBT.
* [sbt-native-packager](http://www.scala-sbt.org/sbt-native-packager/) packages the Scala application into a deployable unit with its dependencies.
* The [sbt-native-packager Docker Plugin](http://www.scala-sbt.org/sbt-native-packager/formats/docker.html) will go the extra mile to build your Docker image and publish it where you ask it to.
* By default Docker ([What is Docker?](https://www.docker.com/what-docker)) will publish to the [Docker Hub](https://docs.docker.com/docker-hub/) which you should sign up to.
* [Most important streaming abstraction](https://www.scalawilliam.com/most-important-streaming-abstraction/)

Also, for [`sbt new`](http://www.scala-sbt.org/0.13/docs/sbt-new-and-Templates.html) support:
* Using the [Giter8 templating](http://www.foundweekends.org/giter8/).
* [`sbt new` documentation](http://www.scala-sbt.org/0.13/docs/sbt-new-and-Templates.html).

# Other notes
To regenerate TOC we use [markdown-toc](https://github.com/jonschlinkert/markdown-toc):

```bash
$ npm install -g markdown-toc
$ markdown-toc -i README.md
```

# Licence
* MIT. Copyright (2016) Apt Elements Ltd. [William Narmontas](https://www.scalawilliam.com/)
