(ns my.app
  (:require [vertx.core :as vc]
            [vertx.repl :as r]))

(vc/deploy-verticle "bridge_server.js")
(r/start-repl)
