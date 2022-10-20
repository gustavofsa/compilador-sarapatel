/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoExpTermo extends PTermo
{
    private PBlocoExpressoes _blocoExpressoes_;

    public ABlocoExpTermo()
    {
        // Constructor
    }

    public ABlocoExpTermo(
        @SuppressWarnings("hiding") PBlocoExpressoes _blocoExpressoes_)
    {
        // Constructor
        setBlocoExpressoes(_blocoExpressoes_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoExpTermo(
            cloneNode(this._blocoExpressoes_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoExpTermo(this);
    }

    public PBlocoExpressoes getBlocoExpressoes()
    {
        return this._blocoExpressoes_;
    }

    public void setBlocoExpressoes(PBlocoExpressoes node)
    {
        if(this._blocoExpressoes_ != null)
        {
            this._blocoExpressoes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoExpressoes_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoExpressoes_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoExpressoes_ == child)
        {
            this._blocoExpressoes_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoExpressoes_ == oldChild)
        {
            setBlocoExpressoes((PBlocoExpressoes) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
