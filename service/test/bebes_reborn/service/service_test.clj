;; ---------------------------------------------------------
;; bebes-reborn.service.service-test
;;
;; Example unit tests for bebes-reborn.service
;;
;; - `deftest` - test a specific function
;; - `testing` logically group assertions within a function test
;; - `is` assertion:  expected value then function call
;; ---------------------------------------------------------

(ns bebes-reborn.service.service-test
  (:require [clojure.test :refer [deftest is testing]]
            [bebes-reborn.service.service :as service]))

(deftest service-test
  (testing "TODO: Start with a failing test, make it pass, then refactor"

    ;; TODO: fix greet function to pass test
    (is (= "bebes-reborn service service developed by the secret engineering team"
           (service/greet)))

    ;; TODO: fix test by calling greet with {:team-name "Practicalli Engineering"}
    (is (= (service/greet "Practicalli Engineering")
           "bebes-reborn service service developed by the Practicalli Engineering team"))))
