import kotlin.test.assertNotEquals

fun main() {
    //kotlinは「main」関数が存在している場合は必ずそこから開始する。
    //また、末尾にセミコロンを記載することは不要。
    println("Hello World!")

    var count: Int = 10
    //「val」は後から変更できない値を格納する変数に使用する
    //count = 19
    //後から値を更新しようとするとエラーとなる。
    println(count)

    var changeCount: Int = 10
    //「var」は後から変更可能な値を格納する変数に使用する。
    changeCount = 12
    //後から値を更新しようとしてもエラーとならない。
    println(changeCount)

    var languageName: String = "TestName"
    //String型やInt型なのか型を宣言してから格納する必要がある。
    //languageName = 123
    //型宣言している変数に違う型の値で更新しようとすると実行時にエラーとなる。

    languageName = "123"
    //同じ型の値を格納する場合は宣言がなくても更新することができる


    println("languageName ::: " + languageName)
    //変数の出力時は、""の中で出力したい変数名の頭に以下の様に「$」をつけると連結する際の冗長箇所が削減できる
    println("languageName ::: $languageName")

    var languageTestName = "TestName_maybe"
    //Kotlinは型推論も行われるため、型宣言をしなくても変数に格納することができる
    println(languageTestName)

    var setLanguageNull: String? = null
    //「null」を変数にセットする場合は、型名の末尾に「？」を記載することで、null許容型となり、保持することができる。
    //これを「nullの完全性」というらしい。
    println("setLanguageNull::: $setLanguageNull")


    //条件分岐はJava同様に記載することが可能
    count = 41

    if (count == 40) {
        println("I have the answer.")
    } else if (count in 36..39 || count in 41..44) {
        println("The answer is close.")
    } else {
        println("The answer eludes me.")
    }

    //上記だと冗長な記載が多いため、以下の様に記載することもできる
    var answerString: String = if (count == 40) {
        "I have the answer."
    } else if (count in 36..39 || count in 41..44) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }

    println("answerString ::: $answerString")

    //さらにif文をwhenに変えることも可能
    var anotherString = when {
        count == 40 -> "I have the answer."
        count in 36..39 || count in 41..44 -> "The answer is close."
        else -> "The answer eludes me."
    }
    //上記の様に 条件、矢印（->）、結果という記載をすることで、条件の結果がTrueだった場合に結果の処理を行う。
    //最後にelse、矢印、結果を記載することで、条件以外の処理を行うよう記載する。

    //さらにwhen文では上記の文章を以下に修正し省略可能、これが文法的な正解らしい。。。
     anotherString = when (count) {
        40 -> "I have the answer."
        in 36..39,in 41..44 -> "The answer is close."
        else -> "The answer eludes me."
    }

    println("anotherString ::: $anotherString")

}