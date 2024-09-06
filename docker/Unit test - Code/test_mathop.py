import mathop
import pytest
import sys

@pytest.mark.number
def test_add():
    assert mathop.add(10) == 12
    assert mathop.add(4,5) == 9

# @pytest.mark.skipif(sys.version_info > (3, 3), reason='Do not run multiplication')
# @pytest.mark.skipif(sys.version_info > (3, 10), reason='Do not run multiplication')
@pytest.mark.skipif(sys.platform.startswith("win"), reason="fork not available on Windows",)
def test_mul():
    assert mathop.mul(4) == 20
    assert mathop.mul(10) == 50

def test_add_strings():
    res = mathop.add('CSE', '308')
    assert res == 'CSE308'
    assert type(res) == str
    assert '308' in res

