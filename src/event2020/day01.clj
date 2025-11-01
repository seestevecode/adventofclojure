;;;; Advent of Code 2020 Day 1 - Report Repair

(ns event2020.day01
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2020 1))

(defn- parsed [input] (mapv parse-long (str/split-lines input)))

(defn- two-sum-prod
  [target coll]
  (let [r (reduce (fn [seen x]
                    (let [y (- target x)]
                      (if (seen y) (reduced (* x y)) (conj seen x))))
            #{}
            coll)]
    (when (number? r) r)))

(defn part-1 [input] (two-sum-prod 2020 (parsed input)))
(defn part-2
  [input]
  (let [p (parsed input)]
    (some #(let [a (p %)
                 tail (subvec p (inc %))]
             (when-some [prod-2 (two-sum-prod (- 2020 a) tail)] (* a prod-2)))
          (range (count p)))))

(aoc/solve puzzle-input part-1 part-2) ; [100419 265253940]

