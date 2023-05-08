package dev.kesatria.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringBootBlogApplication

fun main(args: Array<String>) {
    runApplication<SpringBootBlogApplication>(*args)
}
