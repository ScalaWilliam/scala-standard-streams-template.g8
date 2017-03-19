# $name$

# Building

* Docker image, locally: `sbt docker:publishLocal`
* Docker image: `sbt docker:publish`
* Distribution package (bare): `sbt 'show stage'`
* Distribution package (zip): `sbt 'show stage'` or `sbt 'show dist'`

## Running locally

```
\$ ./target/universal/stage/bin/$project_name$
```

## Running in Docker

```
\$ docker run -i $project_name$
```

You may pass arguments via `JAVA_OPTS` environment variable.

## Further detail

Built using [ScalaWilliam/scala-standard-streams-template.g8](https://github.com/ScalaWilliam/scala-standard-streams-template.g8)
