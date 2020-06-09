# dorab-lib-template

clj-new template to be used for Dorab's libs.

## Usage

## Basic Usage

Set up an alias for clj-new

```clj
    {:aliases
     {:new {:extra-deps {seancorfield/clj-new
                         {:mvn/version "1.0.199"}}
            :main-opts ["-m" "clj-new.create"]}}
     ...}
```

### Using from Clojars

The easiest way is to use clj-new and this template from Clojars. 
To create an application with just the base template, use this command:

```
clj -A:new dorab-lib-template <myname>/<project-name>
```

where you might, for example, substitute `my-github-name/my-killer-app` for the
`<myname/project-name>` bit or, perhaps, `my-orgname-name/an-early-masterpiece`.

By default this will try to write the output to the path` myname/project-name`.
If you want it to just go to `project-name` or some other arbitrary name you can
append at the end `-o project-name` or whatever name you want.

### Using from a local repo

An alternative is to clone this repo locally.  In that case, use this
command:

```
clj -A:new <path-to-local-repo>::dorab-lib-template <myname>/<project-name>
```


## Building the template repo itself

Build a deployable jar of this template:

    $ clojure -A:jar

Install it locally:

    $ clojure -A:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -A:deploy

## License

The MIT License (MIT)

Copyright © 2020 Dorab Patel
