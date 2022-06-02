package com.mangofactory.postapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}