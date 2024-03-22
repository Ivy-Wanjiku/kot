
    fun main() {
        var friends  = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
        friends = friends.plus("Nataly")
        friends=friends.plus(arrayOf("Gitahi","Jane","Gatweri"))
        println(friends.contentToString())
        println(friends.contentToString())
        println(friends[2])
        wordsArray(arrayOf("Wanjiku","Wangui","Kemunto","Saruni"))
        val nums = arrayOf(1, 2, 3, 4, 5)
        val data = arrayOf("Kenya", 5100, 2.7F, true)
        println(data.contentToString())
        println(nums.contentToString())
        println(friends.get(3))
        println(friends.slice(1..3))
        friends.set(1, "Nancy")
        println(friends.contentToString())
        friends[1] = "Wanjiku"
        friends
        println(friends.contentToString())
        var X: Int? = null
        X = 5
        println(X)
        var x: Int? = 15
        x = null
        println(x)
        println(friends.indexOf("Ken"))
        println(friends.indexOf("wanjiku"))
        var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
     
        val statistics= arrayOf(21,14,56,18,9,32,5,6,32,67,88,43)
println(statistics.maxOrNull())
        println(statistics.minOrNull())
        val mt=Array(3){""}
        mt[0]="Hey"
        mt[1]="Ivy"
mt[2]="How are u"
        println(mt.contentToString())
        val arr= arrayOf<Int>()
            println(arr.maxOrNull())
        println(statistics.count())
println(statistics.average())
        println(statistics.sum()/statistics.size)
        println(statistics.sum().toDouble()/statistics.size)
      friends= friends.sortedArray()
        println(statistics.contentToString())
        friends.forEach {ivy ->
            println(ivy)
        }
        statistics.forEach { num ->
            println(num*num)
        }
        for(o in friends){
            println(o)
        }
        for(g in statistics) {
            println(g * g)
        }
        friends.forEachIndexed{idx,y->
            if(idx==1 || idx==2){
                println(y)
            }
        }

var churchMates= arrayOf("Tonny","Ian" ,"Ivy","Lisha","Victor")
        churchMates.forEachIndexed{idx,k->
            if(idx==4 || idx==2){
                println(k)
            }
        }
    }

    fun wordsArray(name:Array<String>){
        println(name.contentToString())


    }
    fun numbersArray(numbers: Array<Int>){
        println(numbers.contentToString())


    }
