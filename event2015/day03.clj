(ns event2015.day03
  " Advent of Code 2015 Day 3 - Perfectly Spherical Houses in a Vacuum"
  (:require [clojure.string :as str]
            [clojure.set :as set]))

(def move-map {\^ [0 -1], \> [1 0], \v [0 1], \< [-1 0]})
(defn- visited
  [moves]
  (set (reductions #(map + %1 (get move-map %2)) [0 0] moves)))

(defn part-1 [data] (count (visited data)))
(defn part-2
  [data]
  (let [santa-visited (visited (take-nth 2 data))
        robot-visited (visited (take-nth 2 (rest data)))]
    (count (set/union santa-visited robot-visited))))

(defn -main
  [& _]
  (let [input (slurp *in*)
        data (str/trim-newline input)]
    (println "Solutions:" [(part-1 data) (part-2 data)])))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))

; Solutions: [2081 2341]
