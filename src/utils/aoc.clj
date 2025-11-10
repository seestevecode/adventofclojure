(ns utils.aoc)

(defn slurp-input
  "Get input for a given year and day
   e.g. `resources/event_2024/aoc2024-d01-input.txt`"
  [year day]
  (slurp (format "resources/event_%d/aoc%d-d%02d-input.txt" year year day)))

(defn solve
  "Call one or more part functions on `input`.
   - (solve input parse part-1) => single result
   - (solve input parse part-1 part-2) => vector of results [r1 r2]
   The order of results matches the order of the functions passed."
  [input parser f & fs]
  (assert f "You must supply at least one part function (e.g. part-1).")
  (let [fns (cons f fs)
        parsed (parser input)
        results (mapv #(time (% parsed)) fns)]
    (if (= 1 (count results)) (first results) results)))

