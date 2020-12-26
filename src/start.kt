fun main(){
    //kotlinは「main」関数が存在している場合は必ずそこから開始する。
    println("Hello World!")

    val count: Int = 10
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


    println("languageName ::: " + languageName )

    var languageTestName = "TestName_maybe"
    //Kotlinは型推論も行われるため、型宣言をしなくても変数に格納することができる
    println(languageTestName)

    var setLanguageNull: String? = null
    //「null」を変数にセットする場合は、型名の末尾に「？」を記載することで、null許容型となり、保持することができる。
    println("setLanguageNull" + setLanguageNull)

}