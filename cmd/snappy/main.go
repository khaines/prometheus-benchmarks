package main

import (
	"os"

	"github.com/golang/snappy"
)

func main() {
	compressed := snappy.Encode(nil, []byte("hello world"))
	os.Stdout.Write(compressed)
}
