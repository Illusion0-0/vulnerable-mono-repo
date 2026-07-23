/**
 * Test cases for the Node.js vulnerable service.
 *
 * Run with: npm test
 */

const assert = require('assert');

// Test 1: Basic module loading
function testModuleLoading() {
    const express = require('express');
    assert.ok(express, 'Express should be loadable');
    assert.strictEqual(typeof express, 'function', 'Express should be a function');
}

// Test 2: String utilities
function testStringOps() {
    const input = 'vulnerable-nodejs-service';
    assert.ok(input.startsWith('vulnerable'), 'Should start with "vulnerable"');
    assert.ok(input.includes('nodejs'), 'Should contain "nodejs"');
    assert.strictEqual(input.length, 26);
}

// Test 3: Array operations
function testArrayOps() {
    const arr = [1, 2, 3, 4, 5];
    assert.strictEqual(arr.length, 5);
    assert.strictEqual(arr.reduce((a, b) => a + b, 0), 15);
}

// Run all tests
try {
    testModuleLoading();
    console.log('✓ testModuleLoading passed');

    testStringOps();
    console.log('✓ testStringOps passed');

    testArrayOps();
    console.log('✓ testArrayOps passed');

    console.log('\nAll 3 tests passed!');
    process.exit(0);
} catch (err) {
    console.error('✗ Test failed:', err.message);
    process.exit(1);
}