#!/usr/bin/env groovy

def call() {
    sh 'helm upgrade --install k8-golang-demo k8-golang-demo'
}
