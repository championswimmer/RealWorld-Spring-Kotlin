package tech.arnav.conduit.data.entities

import java.net.URL
import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "users")
data class User(
    @Column(unique = true, nullable = false)
    val username: String,
    val email: String,
    val bio: String,
    val password: String,
    val image: URL
) : BaseEntity()