"""Test cases for the Python vulnerable service.

Run with: python -m pytest test_app.py -v
"""
import pytest


def test_imports():
    """Test that basic imports work."""
    import yaml
    import requests
    assert yaml is not None
    assert requests is not None


def test_yaml_safe_load():
    """Test that YAML can be safely loaded."""
    import yaml
    data = yaml.safe_load("key: value")
    assert data == {"key": "value"}


def test_requests_version_format():
    """Test that requests has a valid version string."""
    import requests
    assert hasattr(requests, "__version__")
    version_parts = requests.__version__.split(".")
    assert len(version_parts) >= 2  # at least major.minor


def test_math_operations():
    """Basic arithmetic test."""
    assert 1 + 1 == 2
    assert 10 * 10 == 100


def test_string_operations():
    """String manipulation test."""
    s = "vulnerable-python-service"
    assert s.startswith("vulnerable")
    assert "python" in s
    assert s.upper() == "VULNERABLE-PYTHON-SERVICE"