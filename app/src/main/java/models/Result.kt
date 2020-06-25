package models

import androidx.room.Ignore

data class Result(
    val abstract: String,
    val adx_keywords: String,
    val asset_id: Long,
    val byline: String,
    val column: Any,
    @Ignore
    val des_facet: List<String>,
    val eta_id: Int,
    @Ignore
    val geo_facet: List<String>,
    val id: Long,
    @Ignore
    val media: List<Media>,
    val nytdsection: String,
    @Ignore
    val org_facet: List<String>,
    @Ignore
    val per_facet: List<String>,
    val published_date: String,
    val section: String,
    val source: String,
    val subsection: String,
    val title: String,
    val type: String,
    val updated: String,
    val uri: String,
    val url: String
)