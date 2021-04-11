package tech.arnav.conduit.data.entities

import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "tags")
data class Tag(
    @Column(unique = true, nullable = false)
    val name: String
) : BaseEntity()
