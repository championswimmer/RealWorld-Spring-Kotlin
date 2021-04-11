package tech.arnav.conduit.data.entities

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToOne

@Entity(name = "comments")
data class Comment(
    val body: String,
    @ManyToOne(fetch = FetchType.EAGER)
    val author: User
) : BaseEntity()
