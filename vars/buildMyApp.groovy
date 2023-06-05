#!/usr/bin/env groovy

def call() {
    sh 'docker build -t go/server:v4 .'
    sh 'docker push go/server:v4'
}