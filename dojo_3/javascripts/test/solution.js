const chai = require('chai');

const Bomber = require('../bomber');
const Cell = require('../cell');
const Something = require('../something');

describe("bomberman", () => {
    describe("bomberman", () => {
        it("steps into a cell which is empty then it moves in", () => {

        });

        it("steps into a cell which is busy with an object then it doesn't move and throw an exception", () => {
        });

        it.skip("steps into a cell which is busy with an enemy then it dies", () => {
        });

        it.skip("leaves a boom next to a brick, the boom explotes and the bricks disappears", () => {
        });

        it.skip("throws a boom to a brick, the boom explotes and the bricks disappears", () => {
        });
    });

});
