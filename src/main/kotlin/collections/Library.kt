package collections

object Library {
    val books: List<Book> = listOf(
        Book(
            title = "Zero to One",
            authors = listOf(Author("Peter Thiel"), Author("Blake Masters")),
            genre = Genre.NonFiction.Business,
            price = 1963
        ),
        Book(
            title = "Why We Sleep: Unlocking the Power of Sleep and Dreams",
            author = Author("Matthew Walker"),
            genre = Genre.NonFiction.SelfHelp,
            price = 1796
        ),
        Book(
            title = "Utopia for Realists: How We Can Build the Ideal World",
            author = Author("Rutger Bregman"),
            genre = Genre.NonFiction.Politics,
            price = 899
        ),
        Book(
            title = "Friend of a Friend: Understanding the Hidden Networks That Can Transform Your Life and Your Career",
            author = Author("David Burkus"),
            genre = Genre.NonFiction.Business,
            price = 1469
        ),
        Book(
            title = "The Moment of Lift: How Empowering Women Changes the World",
            author = Author("Melinda Gates"),
            genre = Genre.NonFiction.Feminism,
            price = 1449
        ),
        Book(
            title = "Profit First: Transform Your Business from a Cash-Eating Monster to a Money-Making Machine",
            author = Author("Mike Michalowicz"),
            genre = Genre.NonFiction.Business,
            price = 1916
        ),
        Book(
            title = "The Dip: A Little Book That Teaches You When to Quit (and When to Stick)",
            author = Author("Seth Godin"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 949
        ),
        Book(
            title = "The Making of a Manager: What to Do When Everyone Looks to You",
            author = Author("Julie Zhuo"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1529
        ),
        Book(
            title = "The Transparency Sale: How Unexpected Honesty and Understanding the Buying Brain Can Transform Your Results",
            author = Author("Todd Caponi"),
            genre = Genre.NonFiction.Business,
            price = 1549
        ),
        Book(
            title = "Company of One: Why Staying Small Is the Next Big Thing for Business",
            author = Author("Paul Jarvis"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1159
        ),
        Book(
            title = "It Doesn't Have to Be Crazy at Work",
            authors = listOf(Author("Jason Fried"), Author("David Heinemeier Hansson")),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1639
        ),
        Book(
            title = "How Democracies Die",
            authors = listOf(Author("Steven Levitsky"), Author("Daniel Ziblatt")),
            genre = Genre.NonFiction.Politics,
            price = 1175
        ),
        Book(
            title = "ReWork",
            authors = listOf(Author("Jason Fried"), Author("David Heinemeier Hansson")),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1499
        ),
        Book(
            title = "High Output Management",
            author = Author("Andrew Grove"),
            genre = Genre.NonFiction.Business,
            price = 899
        ),
        Book(
            title = "Solving the Procrastination Puzzle: A Concise Guide to Strategies for Change",
            author = Author("Timothy Pychyl"),
            genre = Genre.NonFiction.SelfHelp,
            price = 999
        ),
        Book(
            title = "Blitzscaling: The Lightning-Fast Path to Building Massively Valuable Companies",
            authors = listOf(Author("Reid Hoffman"), Author("Chris Yeh")),
            genre = Genre.NonFiction.Business,
            price = 1829
        ),
        Book(
            title = "Capital Gaines: Smart Things I Learned Doing Stupid Stuff",
            author = Author("Chip Gaines"),
            genres = listOf(Genre.NonFiction.Biography, Genre.NonFiction.Business),
            price = 1681
        ),
        Book(
            title = "Digital Minimalism: Choosing a Focused Life in a Noisy World",
            author = Author("Cal Newport"),
            genre = Genre.NonFiction.SelfHelp,
            price = 1599
        ),
        Book(
            title = "Leaders Eat Last: Why Some Teams Pull Together and Others Don't",
            author = Author("Simon Sinek"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 989
        ),
        Book(
            title = "The Compound Effect",
            author = Author("Darren Hardy"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1249
        ),
        Book(
            title = "Start with Why: How Great Leaders Inspire Everyone to Take Action",
            author = Author("Simon Sinek"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 879
        ),
        Book(
            title = "The Hard Thing About Hard Things: Building a Business When There Are No Easy Answers",
            author = Author("Ben Horowitz"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 2111
        ),
        Book(
            title = "Hooked: How to Build Habit-Forming Products",
            author = Author("Nir Eyal"),
            genre = Genre.NonFiction.Business,
            price = 1847
        ),
        Book(
            title = "Make Your Bed: Little Things That Can Change Your Life...And Maybe the World",
            author = Author("William McRaven"),
            genres = listOf(Genre.NonFiction.Business, Genre.NonFiction.SelfHelp),
            price = 1148
        ),
        Book(
            title = "How Google Works",
            authors = listOf(Author("Eric Schmidt"), Author("Jonathan Rosenberg ")),
            genre = Genre.NonFiction.Business,
            price = 1399
        ),
        Book(
            title = "Artemis",
            author = Author("Andy Weir"),
            genre = Genre.Fiction.ScienceFiction,
            price = 1059
        ),
        Book(
            title = "The Martian",
            author = Author("Andy Weir"),
            genre = Genre.Fiction.ScienceFiction,
            price = 969
        ),
        Book(
            title = "The Ballad of Songbirds and Snakes",
            author = Author("Suzanne Collins"),
            genres = listOf(Genre.Fiction.Fantasy, Genre.Fiction.ScienceFiction),
            price = 1737
        ),
        Book(
            title = "The Hunger Games",
            author = Author("Suzanne Collins"),
            genres = listOf(Genre.Fiction.Fantasy, Genre.Fiction.ScienceFiction),
            price = 877
        ),
        Book(
            title = "Catching Fire",
            author = Author("Suzanne Collins"),
            genres = listOf(Genre.Fiction.Fantasy, Genre.Fiction.ScienceFiction),
            price = 991
        ),
        Book(
            title = "Mockingjay",
            author = Author("Suzanne Collins"),
            genres = listOf(Genre.Fiction.Fantasy, Genre.Fiction.ScienceFiction),
            price = 1017
        ),
        Book(
            title = "Lord of the Flies",
            author = Author("William Golding"),
            genre = Genre.Fiction.Classics,
            price = 599
        ),
        Book(
            title = "Harry Potter and the Sorcerer's Stone",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 3419
        ),
        Book(
            title = "Harry Potter and the Chamber of Secrets",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 2057
        ),
        Book(
            title = "Harry Potter and the Prisoner of Azkaban",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 2069
        ),
        Book(
            title = "Harry Potter and the Goblet of Fire",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 3498
        ),
        Book(
            title = "Harry Potter and the Order of the Phoenix",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 4505
        ),
        Book(
            title = "Harry Potter and the Half-Blood Prince",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 1999
        ),
        Book(
            title = "Harry Potter and the Deathly Hallows",
            author = Author("J.K. Rowling"),
            genre = Genre.Fiction.Fantasy,
            price = 1374
        )
    )
}

data class Book(val title: String, val authors: List<Author>, val genres: List<Genre>, val price: Int) {
    constructor(title: String, author: Author, genre: Genre, price: Int) : this(title, listOf(author), listOf(genre), price)
    constructor(title: String, authors: List<Author>, genre: Genre, price: Int) : this (title, authors, listOf(genre), price)
    constructor(title: String, author: Author, genres: List<Genre>, price: Int) : this(title, listOf(author), genres, price)
}

data class Author(val name: String)

sealed class Genre {

    sealed class Fiction : Genre() {
        object Classics : Fiction()
        object Fantasy : Fiction()
        object ScienceFiction : Fiction()
    }

    sealed class NonFiction : Genre() {
        object Biography : NonFiction()
        object Business : NonFiction()
        object Feminism : NonFiction()
        object Politics : NonFiction()
        object SelfHelp : NonFiction()
    }

    override fun toString(): String {
        return this::javaClass.get().simpleName
    }
}