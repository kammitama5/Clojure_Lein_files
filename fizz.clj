(defn fizzbuzz []
	(doseq [i (range 1 101)]
		(println (cond(and (zero? (rem i 3))
			(zero? (rem i 5)))
		"Fizzbuzz"
		(zero? (rem i 3))
		"Fizz"
		(zero? (rem i 5))
		"Buzz"
		:else i))))