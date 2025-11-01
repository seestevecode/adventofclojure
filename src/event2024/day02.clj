;;;; Advent of Code 2024 Day 2 - Red-Nosed Reports

(ns event2024.day02
  (:require [clojure.string :as str]
            [utils.aoc :as aoc]))

(def puzzle-input (aoc/get-input 2024 2))

(defn- parsed
  [input]
  (mapv #(mapv parse-long (str/split % #"\s+")) (str/split-lines input)))

(defn- rests
  "Return all subvectors of a vector where each element has been removed"
  [v]
  (for [i (range (count v))] (concat (subvec v 0 i) (subvec v (inc i)))))

(defn- safe?
  [v]
  (and (or (apply < v) (apply > v))
       (every? #(<= 1 % 3) (map #(abs (- %1 %2)) v (rest v)))))

(defn- safe-dampened? [v] (some true? (map safe? (rests v))))

(defn part-1 [input] (count (filter safe? (parsed input))))
(defn part-2 [input] (count (filter safe-dampened? (parsed input))))

(aoc/solve puzzle-input part-1 part-2) ; [585 626]

