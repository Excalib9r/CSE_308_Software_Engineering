import add
import pytest


@pytest.mark.parametrize("inp1, inp2, exp", [[2, 3, "positive"]])
def test_return_value(inp1, inp2, exp):
    assert add.find_sign(inp1, inp2) == exp


# @pytest.mark.parametrize("inp1, inp2, exp", [[2, 3, "positive"],[-3, -4, "negative"]])
# def test_return_value(inp1, inp2, exp):
#     assert add.find_sign(inp1, inp2) == exp