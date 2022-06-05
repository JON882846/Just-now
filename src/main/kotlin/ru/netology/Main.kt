package ru.netology

const val Minute = 60
const val Hour = 3600
const val Day = 86400
const val TWO_DAY = 172800
const val THREE_DAY = 259200


fun main() {
 agoToText(870)

}

fun agoToText (
 second: Int,

){
when (second){
 in 0..Minute ->  println("был (а) в сети $second только что")

 in Minute + 1..Hour -> println("был (а) в сети  минут назад")

 in Hour + 1..Day  -> println("был (а) в сети  часов назад")

 in Day ..TWO_DAY  -> println("был (а) в сети  часов назад")

 in TWO_DAY ..THREE_DAY  -> println("был (а) в сети  часов назад")

 else -> println("в сети не появлялся")


}


}


















//val a = commCalc(1000_00, prevTrans = 17_00)
//message(a,"VK Pay")
//val b = commCalc(105000_00, card = "Visa", prevTrans = 1007_00)
//message(b,"Visa")
//val c = commCalc(1000_00, card = "Maestro", prevTrans = 17525_00)
//message(c,"Maestro")
//val e = commCalc(1000_00, card = "Mir", prevTrans = 1457_00)
//message(e,"Mir")
//val d = commCalc(100300_00, card = "Mastercard", prevTrans = 17000_00)
//message(d,"Mastercard")
//
//
//
//
//fun message(
//    сommission: Int,
//    card: String
//) {
//    val result = (сommission.toDouble()/100)
//    val ruble = сommission/100
//    val penny =  ((result - (сommission/100))*100).toInt()
//
//    println("Коммисия за перевод по карте $card равна: $ruble рублей $penny копейк")
//}
//
//fun commCalc (
//    amount: Int,
//    card: String = "VK Pay",
//    prevTrans: Int = 0
//): Int{
//   return when (card){
//      NAME_CARD_VK_PAY-> {
//          0
//      }
//       NAME_CARD_MAESTRO,NAME_CARD_MASTERCARD-> {
//           val summTransMax = 75000_00
//           val сommission = 0.6
//           val сommissionFixed = 20_00
//
//           val result = amount + prevTrans
//
//           if (result > summTransMax) {
//               return (((amount/100 * сommission)) + сommissionFixed).toInt()
//           } else {
//              0
//           }
//       }
//       NAME_CARD_VISA,NAME_CARD_MIR->{
//           val сommission = 0.75
//           val fixedCommission = 3500
//           val result = (((amount/100 * сommission))).toInt()
//           return if(result>=fixedCommission){
//               result
//           }else{
//               fixedCommission
//           }
//       }
//       else -> {
//           error("Нет такой карты")
//       }
//    }
//}

