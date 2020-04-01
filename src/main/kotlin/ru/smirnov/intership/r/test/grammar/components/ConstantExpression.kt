package ru.smirnov.intership.r.test.grammar.components

/**
 * Class for storing constant expression (number, positive or negative)
 */
class ConstantExpression(val number: String) : Expression {
    override fun <T> accept(visitor: ComponentVisitor<T>): T? {
        return visitor.visitConstantExpression(this)
    }

    override fun buildString(builder: StringBuilder) {
        builder.append(number)
    }

    override fun equals(other: Any?): Boolean {
        return other is ConstantExpression && other.number == this.number
    }
}