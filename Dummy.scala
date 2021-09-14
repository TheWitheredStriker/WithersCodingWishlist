// Dummy file to make GitHub identify a programming language in this repo (I decided to go with Scala here)

object Main:
    var verbose = false

    def main(args: Array[String]) =
        for (a <- args) a match
            case "-h" | "-help"  =>
                println("Usage: scala Main [-help|-verbose]")

            case "-v" | "-verbose" =>
                verbose = true

            case x =>
                println("Unknown option: '" + x + "'")
    
        if (verbose)
            println("How are you today?")
