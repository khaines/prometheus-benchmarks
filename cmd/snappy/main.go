package main

import (
	"os"

	"github.com/golang/snappy"
)

func main() {
	snappy.NewWriter(os.Stdout).Write([]byte("hello world"))
}
