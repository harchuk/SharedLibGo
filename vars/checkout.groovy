#!/usr/bin/env groovy

def call() {
    git branch: 'main', url: 'https://github.com/harchuk/GoServe.git'
}