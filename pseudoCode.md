    Create a HashMap called distances

    For every city in the graph:
        store the city in distances
        set its value to infinity

    Set the starting city's distance to 0

    Create a PriorityQueue

    Add the starting city into the queue
    with distance 0


    While the PriorityQueue is not empty:

        Remove the city with the
        smallest distance from the queue

        Store its city name

        Store its current shortest distance


        Look through all neighboring roads
        connected to the current city

        For each neighboring road:

            Get the neighboring city name

            Get the road weight


            Calculate:

                new distance =
                current distance + road weight


            Compare the new distance
            with the stored distance
            of the neighboring city


            If the new distance is smaller:

                Update the neighboring city's
                shortest distance

                Add the neighboring city
                into the PriorityQueue
                with its updated distance


        After the loop finishes:

            Print every city
            and its shortest distance
            from the starting city