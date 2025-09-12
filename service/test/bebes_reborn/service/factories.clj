(ns bebes-reborn.service.factories
  (:require [bebes-reborn.service.schema :as s]
            [malli.generator :as mg]
            [clojure.uuid :as uuid]))

(def gen-kit (partial mg/generate s/Kit))