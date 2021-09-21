package br.com.dio.coinconverter.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

typealias ExchangeResponse = HashMap<String, ExchangeResponseValue>

@Entity(tableName = "tb_exchange")
data class ExchangeResponseValue(
    @NonNull
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    @NonNull
    val code: String,
    @NonNull
    val codein: String,
    @NonNull
    val name: String,
    @NonNull
    val bid: Double
)