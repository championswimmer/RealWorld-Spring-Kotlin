package tech.arnav.conduit.data.entities

import javax.persistence.*

@Entity(name = "articles")
data class Article(
    @Column(unique = true, nullable = false)
    val slug: String,
    val title: String,
    val description: String,
    val body: String,
    @ManyToOne(fetch = FetchType.EAGER)
    val author: User,
    @OneToMany(fetch = FetchType.LAZY)
    val comments: List<Comment>,
    @ManyToMany(fetch = FetchType.EAGER)
    val tags: List<Tag>
) : BaseEntity()
