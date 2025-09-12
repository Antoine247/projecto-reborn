(ns bebes-reborn.service.factories
  (:require [bebes-reborn.service.schema :as s]
            [malli.generator :as mg]
            [java-time.api :as jt]))


(def random-rate (rand-nth [1350.0 1400.0 1450.0]))
(defn random-model [] (rand-nth ["Saskia" "Levi" "Athena" "Lulu" "Ava" "Noah"]))

