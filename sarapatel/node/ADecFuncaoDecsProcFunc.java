/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecFuncaoDecsProcFunc extends PDecsProcFunc
{
    private PDecFuncao _decFuncao_;

    public ADecFuncaoDecsProcFunc()
    {
        // Constructor
    }

    public ADecFuncaoDecsProcFunc(
        @SuppressWarnings("hiding") PDecFuncao _decFuncao_)
    {
        // Constructor
        setDecFuncao(_decFuncao_);

    }

    @Override
    public Object clone()
    {
        return new ADecFuncaoDecsProcFunc(
            cloneNode(this._decFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncaoDecsProcFunc(this);
    }

    public PDecFuncao getDecFuncao()
    {
        return this._decFuncao_;
    }

    public void setDecFuncao(PDecFuncao node)
    {
        if(this._decFuncao_ != null)
        {
            this._decFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decFuncao_ == child)
        {
            this._decFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decFuncao_ == oldChild)
        {
            setDecFuncao((PDecFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
